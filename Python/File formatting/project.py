import os, shutil
dict_exten={
    'audio_ext':('.mp3','.m4a','wav','flac'),
    'video_ext':('.mp4','.mkv','.flv'),
    'doc_ext':('.doc','.txt','.pdf')
}

path=input('Enter a folder path: ')
def finder(path,ext):
    files=[]
    for file in os.listdir(path):
        for i in ext:
            if file.endswith(i):
                files.append(file)
    return files
for exten_type,exten_tuple in dict_exten.items():
    folder_name=exten_type.split('_')[0]+ ' Files'
    folder_path=os.path.join(path,folder_name)
    os.mkdir(folder_path)
    for item in finder(path,exten_tuple):
        item_path=os.path.join(path,item)
        item_new_path=os.path.join(folder_path,item)
        shutil.move(item_path,item_new_path)