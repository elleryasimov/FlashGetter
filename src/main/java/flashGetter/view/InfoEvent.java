package flashGetter.view;

import java.awt.event.MouseEvent;

import flashGetter.downloader.DownloadManager.TaskEventType;


/**
 * @author decaywood
 * 
 * 2015年1月28日
 * 
 */
public class InfoEvent {
    
    private Class<?> target;
    private Enum<?> operationKey;
    
    private String[] info;
    
    private long[] taskIDs;
    
    public InfoEvent setTaskID(long... taskIDs) {
        this.taskIDs = taskIDs;
        return this;
    }
    
    public long[] getTaskIDs() {
        return taskIDs;
    }
    
    public InfoEvent setInfo(String... info) {
        this.info = info;
        return this;
    }
    
    public String getInfo(int i) {
        return info[i];
    }
    
    public InfoEvent setTarget(Class<?> target) {
        this.target = target;
        return this;
    }
    
    public InfoEvent setOperationKey(Enum<?> key) {
        this.operationKey = key;
        return this;
    }
    
    public Class<?> getTarget() {
        return target;
    }
    
    public Enum<?> getOperationKey() {
        return operationKey;
    }
    
    public InfoEvent newCopy() {
        return new InfoEvent()
        .setInfo(info)
        .setOperationKey(operationKey)
        .setTarget(target)
        .setTaskID(taskIDs);
    }

}
