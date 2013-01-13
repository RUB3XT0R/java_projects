
import java.awt.event.ActionEvent;
import java.util.Date;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import org.primefaces.event.DateSelectEvent;
import org.primefaces.event.ScheduleEntryMoveEvent;
import org.primefaces.event.ScheduleEntryResizeEvent;
import org.primefaces.event.ScheduleEntrySelectEvent;
import org.primefaces.model.DefaultScheduleEvent;
import org.primefaces.model.DefaultScheduleModel;
import org.primefaces.model.LazyScheduleModel;
import org.primefaces.model.ScheduleEvent;
import org.primefaces.model.ScheduleModel;


@Named
@RequestScoped
public class ScheduleController {
   
    private ScheduleModel eventModel;  
      
    private ScheduleModel lazyEventModel;  
  
    private ScheduleEvent event = new DefaultScheduleEvent();  
      
    private String theme;  
  
    public ScheduleController() {  
        eventModel = new DefaultScheduleModel();  
        eventModel.addEvent(new DefaultScheduleEvent("Champions League Match",
                new Date(2012,01,23), new Date(2012,01,23)));  
    }  
      
    public void addEvent(ActionEvent actionEvent) {  
        if(event.getId() == null)  
            eventModel.addEvent(event);  
        else  
            eventModel.updateEvent(event);  
          
        event = new DefaultScheduleEvent();  
    }  
      
    public void onEventSelect(ScheduleEntrySelectEvent selectEvent) {  
        event = selectEvent.getScheduleEvent();  
    }  
      
    public void onDateSelect(DateSelectEvent selectEvent) {  
        event = new DefaultScheduleEvent(Math.random() + "", selectEvent.getDate(), selectEvent.getDate());  
    }  
      
    public void onEventMove(ScheduleEntryMoveEvent event) {  
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Event moved", "Day delta:" + event.getDayDelta() + ", Minute delta:" + event.getMinuteDelta());  
          
        addMessage(message);  
    }  
      
    public void onEventResize(ScheduleEntryResizeEvent event) {  
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Event resized", "Day delta:" + event.getDayDelta() + ", Minute delta:" + event.getMinuteDelta());  
          
        addMessage(message);  
    }  
      
    private void addMessage(FacesMessage message) {  
        FacesContext.getCurrentInstance().addMessage(null, message);  
    }

   public ScheduleEvent getEvent() {
      return event;
   }

   public void setEvent(ScheduleEvent event) {
      this.event = event;
   }

   public ScheduleModel getEventModel() {
      return eventModel;
   }

   public void setEventModel(ScheduleModel eventModel) {
      this.eventModel = eventModel;
   }

   public ScheduleModel getLazyEventModel() {
      return lazyEventModel;
   }

   public void setLazyEventModel(ScheduleModel lazyEventModel) {
      this.lazyEventModel = lazyEventModel;
   }

   public String getTheme() {
      return theme;
   }

   public void setTheme(String theme) {
      this.theme = theme;
   }
      
     
}  