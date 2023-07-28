class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int totalGas = 0; // Total gas available in the tank
        int currentGas = 0; // Gas available at the current station
        int startStation = 0; // Potential starting station
        for (int i = 0; i < n; i++) {
            totalGas += gas[i] - cost[i];
            currentGas += gas[i] - cost[i];
            if (currentGas < 0) {
                startStation = i + 1;
                currentGas = 0;
            }
        }
        return totalGas >= 0 ? startStation : -1;
    }
    }
