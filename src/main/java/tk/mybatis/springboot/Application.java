package tk.mybatis.springboot;

//特别注意，下面的是 tk.MapperScan

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;
import tk.mybatis.springboot.util.MyMapper;

/**
 * @author liuzh
 * @since 2015-12-12 18:22
 */

@SpringBootApplication
@MapperScan(basePackages = "tk.mybatis.springboot.mapper"/*,markerInterface = MyMapper.class*/)
public class Application {
    private Logger logger = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }




}
