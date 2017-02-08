package lundgren.calendarmvp.dayview;

import java.util.List;

import lundgren.calendarmvp.model.CalendarItem;
import lundgren.calendarmvp.model.CalendarItemRepository;

interface DayView {
    interface View {
        void displayCalendarItems(List<CalendarItem> calendarItems);
        void displayLoading();
        void hideLoading();
        void startCreateCalendarItem();
        void startDetailsView(CalendarItem calendarItem);
    }

    interface Presenter {
        void onCreate(DayView view, CalendarItemRepository repository);
        void onCalendarItemClicked(CalendarItem calendarItem);
        void onCreateCalendarItemClick();
    }
}
