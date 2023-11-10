from src.my_object import MyObject


def test_should_fail():
    # Given
    my_object = MyObject()

    # When
    result = my_object.do_something()

    # Then
    assert result is True
