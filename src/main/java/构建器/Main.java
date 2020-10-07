package 构建器;

import 构建器.V1.Person;
import 构建器.V2.ComplexTerrainBuilder;
import 构建器.V2.Terrain;

public class Main {
    public static void main(String[] args) {

        //通过构建器的模式，可以处理多个参数变化的问题
        new Person.PersonBuilder()
                .basicInfo(1,"kevin",12)
//                .score(20)
                .weight(20)
//                .loc("bj","23")
                .build();



        new ComplexTerrainBuilder()
                .buildFort()
                .buildMine()
                .buildWall()
                .build();


    }
}
