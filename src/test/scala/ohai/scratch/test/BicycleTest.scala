package ohai.scratch.test
 
import org.scalatest.Spec
import ohai.scratch.Bicycle
 
class BicycleSpec extends Spec {
 
  describe("A bicycle, prior to any pedaling -") {
    val bike = new Bicycle()

    it("pedal should not have turned") {
      expect(0) { bike.turns }
    }
  }

  describe("A bicycle") {
    val bike = new Bicycle()
    
    bike.pedal

    it("after pedaling once, it should have one turn") {
      expect(1) { bike.turns }
    }
  }
}
