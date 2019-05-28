package service.serivcelmpe;

import service.RmiService;

public class RMIServiceImpe implements RmiService {

    @Override
    public int getAdd(int a, int b) {
        return a+b;
    }
}
