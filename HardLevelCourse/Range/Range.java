package HardLevelCourse.Range;

public final class Range {
    private double from;
    private double to;

    public Range(double from, double to) {
        this.from = from;
        this.to = to;
    }

    public double getFrom() {
        return from;
    }

    public double getTo() {
        return to;
    }

    public void setFrom(double from) {
        this.from = from;
    }

    public void setTo(double to) {
        this.to = to;
    }

    public double getRangeLength() {
        return to - from + 1;
    }

    public boolean isInside(double number) {
        return number - from >= 0 && to - number >= 0;
    }

    public Range isCross(Range inputRange) {
        if (inputRange.from > to || inputRange.to < from) {
            return null;
        } else {
            return new Range(Math.max(from, inputRange.from), Math.min(to, inputRange.to));
        }
    }

    @Override
    public String toString() {
        return "Диапазон: " + from + " " + to;
    }

    public Range[] union(Range inputRange) {
        if (inputRange.from > to || inputRange.to < from) {
            return new Range[]{new Range(from, to), inputRange};
        } else {
            return new Range[]{new Range(Math.min(from, inputRange.from), Math.max(to, inputRange.to))};
        }
    }

    public Range[] difference(Range inputRange) {
        if (inputRange.from > to || inputRange.to < from) {
            return null;
        } else if (inputRange.from == from && inputRange.to == to) {
            return null;
        } else if (inputRange.from == from) {
            return new Range[]{new Range(Math.min(to, inputRange.to), Math.max(to, inputRange.to))};
        } else if (inputRange.to == to) {
            return new Range[]{new Range(Math.min(inputRange.from, from), Math.max(inputRange.from, from))};
        } else {
            return new Range[]{new Range(Math.min(from, inputRange.from), Math.max(from, inputRange.from)), new Range(Math.min(to, inputRange.to), Math.max(to, inputRange.to))};
        }
    }
}
