public enum RimValue {
    I("1"),II("2"),III("3"),IV("4"),V("5"),VI("6"),VII("7"),VIII("8"), XI("9"), X("10");
    private String value;
    RimValue(String value ){
        this.value = value;
    }
    public String  getValue(){
        return value;
    }

    public String toString() {
        return value;
    }
}
