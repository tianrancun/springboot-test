

import com.google.common.base.Joiner;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author vn0ow6b
 * @Title: ListTest
 * @Description: TODO
 * @date 2019/1/9 16:52
 */
public class ListTest {

    @Test
    public void test() {
        List<Integer> linkItems = new ArrayList<>();
        linkItems.add(1);
        linkItems.add(2);
        linkItems.add(3);
        if (linkItems != null) {
            System.out.println(linkItems);
            System.out.println(StringUtils.strip(linkItems.toString()));;
            System.out.println(Joiner.on(",").join(linkItems));
            //copy properties to result list
            Joiner.on(",").join(linkItems);
//                row.setLinkItem(Joiner.on(",").join(linkItems));
        }
    }

}