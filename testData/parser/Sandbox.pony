actor Main
  new create(env:Env) =>
    """
    Test comment
    spanning multiple
    lines
    """
    env.out.print(
    """
    This is a string
    multiline string!
    """)
