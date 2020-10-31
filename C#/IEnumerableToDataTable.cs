using System;
using System.Collections.Generic;
using System.Data;
using System.Linq;

public static class DataTableExtensions
{
    public static DataTable ConvertToDataTable<TSource>(this IEnumerable<TSource> source)
    {
        System.Reflection.PropertyInfo[] props = typeof(TSource).GetProperties();
        DataTable dt = new DataTable();

        dt.Columns.AddRange(
         props.Select(p => new DataColumn(p.Name, Nullable.GetUnderlyingType(
        p.PropertyType) ?? p.PropertyType)).ToArray());
        if (source != null && source.Count() > 0)
        {
            source.ToList().ForEach(
              i => dt.Rows.Add(props.Select(p => p.GetValue(i, null)).ToArray())
            );
        }

        return dt;
    }
}
