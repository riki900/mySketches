
 
NEW_WS=${1}

if [ -z ${NEW_WS} ]
then
    echo "must pass name of new workspace"
    exit 1
fi

echo ${NEW_WS}

mkdir ${NEW_WS}

cp -r template/. ${NEW_WS}/.

cd ${NEW_WS}

mv template.code-workspace ${NEW_WS}.code-workspace
mv template.pde ${NEW_WS}.pde

code .
