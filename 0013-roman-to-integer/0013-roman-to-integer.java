class Solution {
    public int romanToInt(String s) {
        int S = 0;
        int l = s.length();
        
        for (int i = 0; i < l; i++) {
            char k = s.charAt(i);
            int value = 0;
            
            // Assign the value for the current Roman character
            if (k == 'I') value = 1;
            else if (k == 'V') value = 5;
            else if (k == 'X') value = 10;
            else if (k == 'L') value = 50;
            else if (k == 'C') value = 100;
            else if (k == 'D') value = 500;
            else if (k == 'M') value = 1000;

            // If this is not the last character, and the next character is larger, subtract this value
            if (i < l - 1 && value < getValue(s.charAt(i + 1))) {
                S -= value;
            } else {
                S += value;
            }
        }
        
        return S;
    }

    // Helper function to get the value of a Roman numeral character
    private int getValue(char c) {
        if (c == 'I') return 1;
        if (c == 'V') return 5;
        if (c == 'X') return 10;
        if (c == 'L') return 50;
        if (c == 'C') return 100;
        if (c == 'D') return 500;
        if (c == 'M') return 1000;
        return 0; // This shouldn't happen if input is valid
    }
}