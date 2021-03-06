package ocpp.cp.commands;

import com.google.inject.Inject;
import com.google.inject.assistedinject.Assisted;
import ocpp.OcppCommand;
import ocpp.cp._2012._06.*;
import org.apache.commons.cli.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import utils.DateUtil;

import javax.xml.datatype.XMLGregorianCalendar;

public class CancelReservationCommand implements OcppCommand {
    private final Logger log = LoggerFactory.getLogger(CancelReservationCommand.class);

    private final ChargePointService chargePointService;
    private String chargeBoxId = null;
    private int reservation;

    @Inject
    public CancelReservationCommand(@Assisted String parameters,
                                    ChargePointService chargePointService) throws Exception {
        this.chargePointService = chargePointService;
        parseParameters(parameters);
    }

    private void parseParameters(String parameters) throws Exception {
        // create Options object
        Options options = new Options();
        Option reservation = new Option("rid", "reservation", true, "reservation id");
        reservation.setRequired(true);
        options.addOption(reservation);

        Option cpid = new Option("cpid", "chargepoint", true, "charge point id");
        cpid.setRequired(true);
        options.addOption(cpid);

        CommandLineParser parser = new DefaultParser();
        String[] parametersOptions = parameters.split(" ");

        try {
            CommandLine cmd = parser.parse(options, parametersOptions);
            this.reservation = Integer.parseInt(cmd.getOptionValue("reservation"));
            this.chargeBoxId = cmd.getOptionValue("cpid");
        } catch (ParseException e) {
            HelpFormatter formatter = new HelpFormatter();
            formatter.printHelp(getClass().getSimpleName(), options);
            throw e;
        } catch (IllegalArgumentException e) {
            log.warn("'Type' argument is not valid!");
            throw e;
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public Object execute() throws Exception {
        CancelReservationRequest request = new CancelReservationRequest();
        request.setReservationId(reservation);

        CancelReservationResponse response = chargePointService.cancelReservation(request, chargeBoxId);

        if (response == null) {
            throw new Exception("Request unsuccessful... maybe the chargebox (id) is not connected");
        }

        log.info("Received status: {}", response.getStatus());

        return null;
    }
}
