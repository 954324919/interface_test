package Car;

import io.restassured.response.ResponseBody;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.get;

public class CarTest {
    /**
    @BeforeTest
    public void setUp(){
        String test="123";
    }

    @Test
    public void test01(){
        int a=1;
        int b=2;
        System.out.print("hehe");
        try {
            Assert.assertEquals(3, a + b);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    @Test
    public void test02(){
        int a=3;
        int b=4;
        System.out.print("hehe");
        try {
            Assert.assertEquals(7, a + b);
        }catch(Exception e){
            e.printStackTrace();
        }
    }*/
    public void demo(){
        int code=get("http://www.baidu.com").getStatusCode();

    }
}
