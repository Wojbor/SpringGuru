package amaciag.springframework.springGuru.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("uat")
@Service("dataSource")
public class DataSourceUatServiceImpl implements DataSourceService {
    @Override
    public String getDataSource() {
        return "uat DataSource";
    }
}
