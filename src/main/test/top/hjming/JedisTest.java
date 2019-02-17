package top.hjming;

import org.junit.Test;
import redis.clients.jedis.Jedis;

import java.util.Set;

public class JedisTest {

    @Test
    public void  test() throws  Exception{

        Jedis jedis = new Jedis("106.15.197.63", 6379);

        System.out.println(jedis);




    }


}
