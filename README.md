# Scala: Immutable `val` Example

This repository demonstrates a common error in Scala: trying to modify a `val` after its creation.  `val`s in Scala are immutable, meaning their values cannot be changed once initialized.

The `bug.scala` file shows the erroneous code, while `bugSolution.scala` provides a corrected version using a `var` instead.