package service.add;

import org.osoa.sca.annotations.Remotable;

/**
 * @program: task9v6
 * @description:
 * @author: LZP
 * @create: 2019-05-07 15:21
 **/

@Remotable
public interface Add {
    int add(int a, int b);
}
