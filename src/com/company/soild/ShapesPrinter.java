package com.company.soild;

import java.util.List;

public class ShapesPrinter {
    public String json(int sum ){
        return "{shape_sum: %s}".formatted(sum);
    }
    public String csv(int sum){
        return "{shape_sum:,%s}".formatted(sum);
    }
}
