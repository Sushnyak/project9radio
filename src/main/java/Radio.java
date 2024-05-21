public class Radio {
    private int radioSt;
    private int radioValue;

    public int getRadioSt() {
        return radioSt;
    }

    public void setRadioSt(int newRadioSt) {
        if (newRadioSt < 0) {
            return;
        }
        if (newRadioSt > 9) {
            return;
        }
        radioSt = newRadioSt;
    }

    public void nextRadioSt() {
        if (radioSt == 9) {
            radioSt = 0;
            return;
        }
         radioSt++;
    }

    public void prevRadioSt() {
        if (radioSt == 0){
            radioSt = 9;
            return;
        }
        radioSt--;
    }

    public int getRadioValue(){
        return radioValue;
    }

    public void setRadioValue(int newRadioValue){
        if (newRadioValue > 100){
            radioValue = 100;
            return;
        }
        if (newRadioValue < 0){
            radioValue = 0;
            return;
        }
        radioValue = newRadioValue;
    }

    public void upValue() {
        if (radioValue == 100){
            return;
        }
        radioValue++;
    }

    public void downValue() {
        if (radioValue == 0){
            return;
        }
        radioValue--;
    }
}
