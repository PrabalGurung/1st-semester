public static int[] getUniqueElements(int[] input) {
    // Create an empty array to store the unique elements
    int[] uniqueElements = new int[input.length];

    // The index to store the next unique element
    int index = 0;

    // Loop through the input array
    for (int element : input) {
        // Check if the element is already present in the unique elements array
        boolean found = false;
        for (int i = 0; i < index; i++) {
            if (uniqueElements[i] == element) {
                found = true;
                break;
            }
        }

        // If the element is not present, add it to the unique elements array
        if (!found) {
            uniqueElements[index] = element;
            index++;
        }
    }

    // Trim the array to the correct size and return it
    return uniqueElements;
}