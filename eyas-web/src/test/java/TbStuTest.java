import com.fbart.research.dao.StuEntityMapper;
import com.fbart.research.domain.StuEntity;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * wangzhengfa 2017-07-19
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:applicationContext.xml",
        "classpath:applicationContext-mybatis.xml"})
public class TbStuTest {
    @Resource
    private StuEntityMapper stuEntityMapper;


    @Test
    public void testInsert(){
        StuEntity stu = new StuEntity();
        stu.setId(13);
        stu.setName("John13");
        stu.setAge(22);
        int res = stuEntityMapper.insert(stu);
        Assert.assertEquals(1,res);
    }
    @Test
    public void testBatchUpdate(){
        List<StuEntity> mas222 = new ArrayList<>();
        StuEntity stu1 = new StuEntity(1,1);
        StuEntity stu2 = new StuEntity(2,2);
        StuEntity stu3 = new StuEntity(12,12);
        mas222.add(stu1);
        mas222.add(stu2);
        mas222.add(stu3);
        int i = stuEntityMapper.batchUpdate(mas222);
        System.out.printf("Num:"+i);
    }
}