const Something = require('../app/something')

describe("Test something", () => {
  it("do something", () => {
    // When
    console.log(Something)
    const something = new Something()

    // Then\
    expect(something.do()).toBe(true)
  })
})