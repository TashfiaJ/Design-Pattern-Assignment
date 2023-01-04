public class PageSaveMode extends PrintMode{

    @Override
    public void boost() {
        if(page_size=="high" && orientation=="portrayed")
        {
            number_of_pages="Reduced";
        }
        else if(page_size=="medium" && orientation=="landscape")
        {
            number_of_pages="Reduced";
        }
    }

}
