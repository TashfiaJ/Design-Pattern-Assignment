public class LowSave implements ISave {
    @Override
    public void tonerSave(String tonerSavingLevel, String colourIntensity) {
        if(tonerSavingLevel=="low")
        {
            colourIntensity="lowly reduced";
        }
    }
}
