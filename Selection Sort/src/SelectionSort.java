
public class SelectionSort
	{

		
		public static void main(String[] args)
			{
				int [] myArray = {6, 4, 1, 3, 2, 7};
				selectionSort(myArray);

			}
		
		public static void selectionSort(int [] elements)
		{
			for(int i = 0; i < elements.length; i++)
				{
					int minimumIndex = i;
					for(int k = i + 1; k < elements.length; k++)
						{
							if(elements[k] < elements[minimumIndex])
								{
									minimumIndex = k;
								}
						}
					
					int temporary = elements[i];
					elements[i] = elements[minimumIndex];
					elements[minimumIndex] = temporary;
				}
		}

	}
