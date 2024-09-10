package amaciag.springframework.springGuru.controllers.faux;

import amaciag.springframework.springGuru.services.DataSourceService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class FauxController {


    private final DataSourceService dataSourceService;


    public FauxController(@Qualifier(("dataSource")) DataSourceService dataSourceService) {
        this.dataSourceService = dataSourceService;
    }

    public String getDataSourceService() {
        return dataSourceService.getDataSource();
    }
}
