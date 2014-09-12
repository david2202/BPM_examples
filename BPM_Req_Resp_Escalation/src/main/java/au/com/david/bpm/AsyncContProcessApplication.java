package au.com.david.bpm;

import org.camunda.bpm.application.ProcessApplication;
import org.camunda.bpm.application.impl.ServletProcessApplication;

@ProcessApplication("bpm-camunda-asynccont")
public class AsyncContProcessApplication extends ServletProcessApplication {

}
