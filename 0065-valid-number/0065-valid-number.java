
import java.math.BigDecimal;
import java.math.BigInteger;
class Solution {
    public boolean isNumber(String s) {
    String regex="^[+-]?((\\d+(\\.\\d*)?)|(\\.\\d+))([eE][+-]?\\d+)?$";
    // String regex2="^[+-]?\\d+(\\.\\d+)?([eE][+-]?\\d+)?(\\.)?$";
    // String regex3="^[+-]?(\\.)?\\d+(\\d+)?([eE][+-]?\\d+)?$";
    if(s.matches(regex))
    {
        return true;
    }
    else
    {
        return false;
    }

    }
}