import pytest

from src import app


def test_should_fail():
    # When
    result = app.execute()

    # Then
    assert result is True
