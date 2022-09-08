package co.com.bartender.endpoint;

import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.jws.WebService;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import co.com.bartender.logica.LogicaBarTender;

@Path("BartenderServicios")
@Stateless
@WebService
public class BartenderServicio {

    private static final Logger LOG = Logger.getLogger(BartenderServicio.class.getName());

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("consultaValores/")
    public String consultaValores(@QueryParam("iteraciones") int ciclo, @QueryParam("fila") int fila) {
        //TODO return proper representation object

//        Consulta consulta = new Consulta();
//        consulta.setIteracion(iteracion);
//        consulta.setFila(fila);
//
//        Json json = new Json();
//        json.setConsulta(consulta);
//
//        Gson gson = new Gson();
//        String jsonString = gson.toJson(json);
//
//        return jsonString;
        LogicaBarTender logica = new LogicaBarTender();
        logica.ordenarDatos(ciclo, fila);
        
        return "Ok";
    }

}
