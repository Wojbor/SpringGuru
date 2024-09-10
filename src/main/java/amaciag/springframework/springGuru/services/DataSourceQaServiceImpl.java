package amaciag.springframework.springGuru.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("qa")
@Service("dataSource")
public class DataSourceQaServiceImpl implements DataSourceService {
    @Override
    public String getDataSource() {
        return "QA DataSource";
    }
}
