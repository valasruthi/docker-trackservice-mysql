package com.stackroute.muzixtrack.seeddata;


import com.stackroute.muzixtrack.domain.Track;
import com.stackroute.muzixtrack.repository.TrackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.context.ApplicationListener;

//It will get execute, before the server get starts
@Component
public class ApplicationRunnerImpl implements ApplicationListener {
  private TrackRepository trackRepository;
  @Autowired
  public ApplicationRunnerImpl(TrackRepository trackRepository) {
    this.trackRepository = trackRepository;
  }
  @Override
  public void onApplicationEvent(ApplicationEvent applicationEvent) {
    Track track1=new Track(1,"sruthi","good");
    trackRepository.save(track1);
    Track track2=new Track(2,"chinni","great");
    trackRepository.save(track2);
    Track track3=new Track(3,"vala","best");
    trackRepository.save(track3);
  }
}

