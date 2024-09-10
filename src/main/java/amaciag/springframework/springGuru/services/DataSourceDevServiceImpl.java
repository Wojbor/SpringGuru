package amaciag.springframework.springGuru.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"dev", "default"})
@Service("dataSource")
public class DataSourceDevServiceImpl implements DataSourceService {
    @Override
    public String getDataSource() {
        return "dev datasource";
    }
}
