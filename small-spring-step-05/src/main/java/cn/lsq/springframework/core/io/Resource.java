package cn.lsq.springframework.core.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * @description: 资源加载接口
 * @author: shangqing
 * @date: 2022/7/14 21:42
 */
public interface Resource {
    InputStream getInputStream() throws IOException;
}
