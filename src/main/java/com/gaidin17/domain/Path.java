package com.gaidin17.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Evgeny_Akulenko on 3/30/2017.
 */
public class Path {
    private Operation operation;
    private List<Position> positions;

    public Path(Operation operation) {
        this.operation = operation;
        this.positions = new ArrayList<>();
    }

    public Operation getOperation() {
        return operation;
    }

    public List<Position> getPaths() {
        return positions;
    }

    public void addPosition(Position position) {
        positions.add(position);
    }

}
