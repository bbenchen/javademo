package cn.foscala;

import akka.actor.ActorSystem;

public class Boot {
  public static void main(String[] args) {
    ActorSystem actorSystem = ActorSystem.create("test");
  }
}
