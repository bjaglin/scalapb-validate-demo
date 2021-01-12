import mypkg.optout.OptOut

class OptOutSpec extends munit.FunSuite {
  test("Non-transformed types") {
    OptOut(
      positiveInt = Some(2),
      nel = Seq("foo")
    )
  }
}
