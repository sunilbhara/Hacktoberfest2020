def interval_scheduling(stimes, ftimes):
    """Return largest set of mutually compatible activities.
    This will return a maximum-set subset of activities (numbered from 0 to n -
    1) that are mutually compatible. Two activities are mutually compatible if
    the start time of one activity is not less then the finish time of the other.

    stimes[i] is the start time of activity i.
    ftimes[i] is the finish time of activity i.
    """
    """
    Tests:
    Enter number of activities: 5
    Enter the start time of the 5 activities in order: 1 2 3 4 5
    Enter the finish times of the 5 activities in order: 1 4 2 5 3
    Acticity Number         Start Time              End Time
       1                   1                       1
       3                   3                       2
       5                   5                       3
       4                   4                       5
    Enter number of activities: 4
    Enter the start time of the 4 activities in order: 1
    Enter the finish times of the 4 activities in order: 4
    Enter the length of the list you entered does not match
    """
    # index = [0, 1, 2, ..., n - 1] for n items
    index = list(range(len(stimes)))
    # sort according to finish times
    index.sort(key=lambda i: ftimes[i])

    maximal_set = list()  # to store activity number
    start_time_set = list()  # to store respective start time
    finish_time_set = list()  # to store respective end time
    prev_finish_time = 0

    if maximal_set:
        print("No Valid activity Selections Found.")
        exit()
    for i in index:
        if stimes[i] >= prev_finish_time:
            maximal_set.append(i + 1)
            start_time_set.append(stimes[i])
            finish_time_set.append(ftimes[i])
            prev_finish_time = ftimes[i]

    # print the selected activites in a table
    print("{:16s}\t{:16s}\t{:16s}".format("Acticity Number", "Start Time", "End Time"))
    for i in range(len(maximal_set)):
        print(
            "{:8d}\t{:12d}\t{:20d}".format(
                maximal_set[i], start_time_set[i], finish_time_set[i]
            )
        )


n = int(input("Enter number of activities: "))

stimes = input("Enter the start time of the {} activities in order: ".format(n)).split()
if len(stimes) != n:
    print(
        "Length of the list you entered does not match number of elements you inserted"
    )
    exit()
stimes = [int(st) for st in stimes]

ftimes = input(
    "Enter the finish times of the {} activities in order: ".format(n)
).split()
if len(stimes) != n:
    print(
        "Length of the list you entered does not match number of elements you inserted"
    )
    exit()

ftimes = [int(ft) for ft in ftimes]

interval_scheduling(stimes, ftimes)
