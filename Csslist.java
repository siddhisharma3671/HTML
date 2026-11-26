

<!DOCTYPE html>
<html>
<head>
    <title>CSS List Example</title>

    <style>
        h2 {
            color: blue;
        }

        /* Unordered List */
        .list1 {
            list-style-type: square;
        }

        /* Ordered List */
        .list2 {
            list-style-type: upper-roman;
        }

        /* Circle List */
        .list3 {
            list-style-type: circle;
        }

        /* Remove List Bullets */
        .list4 {
            list-style-type: none;
        }
    </style>
</head>

<body>

    <h2>Unordered List - Square</h2>
    <ul class="list1">
        <li>HTML</li>
        <li>CSS</li>
        <li>JavaScript</li>
    </ul>

    <h2>Ordered List - Upper Roman</h2>
    <ol class="list2">
        <li>Java</li>
        <li>Python</li>
        <li>C++</li>
    </ol>

    <h2>Unordered List - Circle</h2>
    <ul class="list3">
        <li>Apple</li>
        <li>Mango</li>
        <li>Orange</li>
    </ul>

    <h2>List Without Bullets</h2>
    <ul class="list4">
        <li>Home</li>
        <li>About</li>
        <li>Contact</li>
    </ul>

<ul type="square">
    <li>HTML</li>
    <li>CSS</li>
</ul>

<ol type="I">
    <li>Java</li>
    <li>Python</li>
</ol>


</body>
</html>
