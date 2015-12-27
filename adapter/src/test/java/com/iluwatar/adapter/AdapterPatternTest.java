package com.iluwatar.adapter;

import org.junit.Test;

/**
 * Test class
 * 
 */
public class AdapterPatternTest {

  @Test
  public void testAdapter() {
    BattleShip battleShip = new BattleFishingBoat();
    battleShip.fire();

  }
}
