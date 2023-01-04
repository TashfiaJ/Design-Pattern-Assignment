import java.util.List;

public class TonerSaveMode extends PrintMode {

    protected String tonerSavingLevel;
    protected String colorIntensity;
    protected List<ISave> save;
    public TonerSaveMode() {

    }
    public TonerSaveMode(List<ISave> save) {
        this.save = save;
    }
    @Override
    public void boost() {
        for (ISave savers : save) {
            if(savers.tonerSave(tonerSavingLevel, colorIntensity)
            {

            }
        }

    }
}
