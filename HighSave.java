public class HighSave implements ISave{
    @Override
    public void tonerSave(String tonerSavingLevel, String colourIntensity) {
        if(tonerSavingLevel=="high")
        {
            colourIntensity="highly reduced";
        }
    }
}
