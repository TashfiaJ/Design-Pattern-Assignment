public class BoosterMode extends PrintMode{

    protected int intensityThreshold, colorIntensity;

    @Override
    public void boost() {
        if(colorIntensity<intensityThreshold)
        {
            colorIntensity++;
        }
    }
}
