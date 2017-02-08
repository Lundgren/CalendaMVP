package lundgren.calendarmvp.createview;

interface CreateView {
    interface View {
        void displayValidation(ValidationResult result);
    }
    interface Presenter {
        void setTitle(String title);
        void setStartTime(int time);
    }
}
