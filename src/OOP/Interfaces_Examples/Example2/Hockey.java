package OOP.Interfaces_Examples.Example2;

public interface Hockey extends Sports{
    void homeGoalScored();
    void visitingGoalScored();
    void endOfPeriod(int period);
    void overtimePeriod(int ot);
}