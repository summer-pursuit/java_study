package junit;

import jdbc.Main;
import lombok.extern.java.Log;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

@Log
public class peizhiwenjian {
    public static void main(String[] args) throws IOException {
        System.out.println(log.getName());
        log.info("我是日志文件");


    }
}
