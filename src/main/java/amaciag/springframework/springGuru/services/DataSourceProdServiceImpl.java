package amaciag.springframework.springGuru.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("prod")
@Service("dataSource")
public class DataSourceProdServiceImpl implements DataSourceService {
    @Override
    public String getDataSource() {
        return "";
    }
}
