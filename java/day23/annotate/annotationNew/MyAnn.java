package day23.annotate.annotationNew;

import java.lang.annotation.Repeatable;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: baiyao
 * @Date: 2023/06/14/15:41
 * @Description:
 */

@Repeatable(AnnArray.class)
public @interface MyAnn {
    String value();
}
